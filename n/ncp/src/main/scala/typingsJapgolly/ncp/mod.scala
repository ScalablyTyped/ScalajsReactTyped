package typingsJapgolly.ncp

import japgolly.scalajs.react.Callback
import typingsJapgolly.ncp.anon.OptionserrsPathLike
import typingsJapgolly.ncp.anon.Optionserrsundefined
import typingsJapgolly.ncp.anon.OptionsstopOnErrtrue
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    source: String,
    destination: String,
    callback: js.Function1[/* err */ js.Array[js.Error] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    source: String,
    destination: String,
    options: OptionserrsPathLike,
    callback: js.Function1[/* err */ WriteStream | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    source: String,
    destination: String,
    options: Optionserrsundefined,
    callback: js.Function1[/* err */ js.Array[js.Error] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    source: String,
    destination: String,
    options: OptionsstopOnErrtrue,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    source: String,
    destination: String,
    options: Options,
    callback: js.Function1[/* err */ js.Error | js.Array[js.Error] | WriteStream | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ncp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ncp", "ncp")
  @js.native
  def ncp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ Any = js.native
  inline def ncp_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ncp")(x.asInstanceOf[js.Any])
  
  /**
    * **NOTE:** This function provides design-time support for util.promisify.
    *
    * It does not exist at runtime.
    */
  inline def promisify(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("__promisify__")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def promisify(source: String, destination: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("__promisify__")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait File extends StObject {
    
    /** Accessed time */
    var atime: js.Date
    
    var mode: Double
    
    /** Modified time */
    var mtime: js.Date
    
    var name: String
  }
  object File {
    
    inline def apply(atime: js.Date, mode: Double, mtime: js.Date, name: String): File = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] = js.undefined
    
    var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      inline def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setErrs(value: PathLike): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      inline def setErrsUndefined: Self = StObject.set(x, "errs", js.undefined)
      
      inline def setFilter(value: js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      inline def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction3((t0: /* read */ ReadableStream, t1: /* write */ WritableStream, t2: /* file */ File) => (value(t0, t1, t2)).runNow()))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
