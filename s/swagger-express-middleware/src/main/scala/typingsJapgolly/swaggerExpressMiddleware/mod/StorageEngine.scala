package typingsJapgolly.swaggerExpressMiddleware.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEngine extends StObject {
  
  def _handleFile(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]
  ): Unit
  
  def _removeFile(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    file: File,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit
}
object StorageEngine {
  
  inline def apply(
    _handleFile: (Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => Callback,
    _removeFile: (Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], File, js.Function1[/* error */ js.Error, Unit]) => Callback
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3((t0: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], t1: File, t2: js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => (_handleFile(t0, t1, t2)).runNow()), _removeFile = js.Any.fromFunction3((t0: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], t1: File, t2: js.Function1[/* error */ js.Error, Unit]) => (_removeFile(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[StorageEngine]
  }
  
  extension [Self <: StorageEngine](x: Self) {
    
    inline def set_handleFile(
      value: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => Callback
    ): Self = StObject.set(x, "_handleFile", js.Any.fromFunction3((t0: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], t1: File, t2: js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def set_removeFile(
      value: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], File, js.Function1[/* error */ js.Error, Unit]) => Callback
    ): Self = StObject.set(x, "_removeFile", js.Any.fromFunction3((t0: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], t1: File, t2: js.Function1[/* error */ js.Error, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
