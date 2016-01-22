@extends('admin')

@section('title', 'Users')
@section('subtitle', 'Edit user')

@section('breadcrumbs')
    <ol class="breadcrumb">
        <li><a href="{{ url('/admin/') }}"><i class="fa fa-group"></i> Home</a></li>
        <li><a href="{{ url('/admin/users') }}">Users</a></li>
        <li class="active">Edit</li>
    </ol>
@endsection

@section('content')
    <section class="content">
        <div class="row">
            <div class="col-xs-12">

                <div class="box box-primary">

                    <div class="box-body">
                        <form role="form" enctype="multipart/form-data" action="{{ url('admin/users/save/' . $user->id) }}" method="post">
                            @include('admin/users/_form')
                        </form>
                    </div><!-- /.box-body -->
                </div><!-- /.box -->
            </div>
        </div>

    </section>
@endsection