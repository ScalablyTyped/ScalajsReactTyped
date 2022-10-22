package typingsJapgolly.filepond.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondCallbackProps extends StObject {
  
  /* Called when a file is clicked or tapped. **/
  var onactivatefile: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** If no error, file has been successfully loaded. */
  var onaddfile: js.UndefOr[
    js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit]
  ] = js.undefined
  
  /** Made progress loading a file. */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit]] = js.undefined
  
  /** Started file load. */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* error */ FilePondErrorDescription, 
      /* file */ js.UndefOr[FilePondFile], 
      /* status */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ FilePondFile, /* output */ Any, Unit]] = js.undefined
  
  /** If no error, Processing of a file has been completed. */
  var onprocessfile: js.UndefOr[
    js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit]
  ] = js.undefined
  
  /** Aborted processing of a file. */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** Made progress processing a file. */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit]] = js.undefined
  
  /** Processing of a file has been reverted. */
  var onprocessfilerevert: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** Called when all files in the list have been processed. */
  var onprocessfiles: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Started processing a file. */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** File has been removed. */
  var onremovefile: js.UndefOr[
    js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit]
  ] = js.undefined
  
  /** Called when the files have been reordered */
  var onreorderfiles: js.UndefOr[js.Function1[/* files */ js.Array[FilePondFile], Unit]] = js.undefined
  
  /** A file has been added or removed, receives a list of file items. */
  var onupdatefiles: js.UndefOr[js.Function1[/* files */ js.Array[FilePondFile], Unit]] = js.undefined
  
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object.
    */
  var onwarning: js.UndefOr[
    js.Function3[
      /* error */ Any, 
      /* file */ js.UndefOr[FilePondFile], 
      /* status */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object FilePondCallbackProps {
  
  inline def apply(): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondCallbackProps]
  }
  
  extension [Self <: FilePondCallbackProps](x: Self) {
    
    inline def setOnactivatefile(value: /* file */ FilePondFile => Callback): Self = StObject.set(x, "onactivatefile", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def setOnactivatefileUndefined: Self = StObject.set(x, "onactivatefile", js.undefined)
    
    inline def setOnaddfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Callback): Self = StObject.set(x, "onaddfile", js.Any.fromFunction2((t0: /* error */ FilePondErrorDescription | Null, t1: /* file */ FilePondFile) => (value(t0, t1)).runNow()))
    
    inline def setOnaddfileUndefined: Self = StObject.set(x, "onaddfile", js.undefined)
    
    inline def setOnaddfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Callback): Self = StObject.set(x, "onaddfileprogress", js.Any.fromFunction2((t0: /* file */ FilePondFile, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnaddfileprogressUndefined: Self = StObject.set(x, "onaddfileprogress", js.undefined)
    
    inline def setOnaddfilestart(value: /* file */ FilePondFile => Callback): Self = StObject.set(x, "onaddfilestart", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def setOnaddfilestartUndefined: Self = StObject.set(x, "onaddfilestart", js.undefined)
    
    inline def setOnerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "onerror", js.Any.fromFunction3((t0: /* error */ FilePondErrorDescription, t1: /* file */ js.UndefOr[FilePondFile], t2: /* status */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOninit(value: Callback): Self = StObject.set(x, "oninit", value.toJsFn)
    
    inline def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    inline def setOnpreparefile(value: (/* file */ FilePondFile, /* output */ Any) => Callback): Self = StObject.set(x, "onpreparefile", js.Any.fromFunction2((t0: /* file */ FilePondFile, t1: /* output */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnpreparefileUndefined: Self = StObject.set(x, "onpreparefile", js.undefined)
    
    inline def setOnprocessfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Callback): Self = StObject.set(x, "onprocessfile", js.Any.fromFunction2((t0: /* error */ FilePondErrorDescription | Null, t1: /* file */ FilePondFile) => (value(t0, t1)).runNow()))
    
    inline def setOnprocessfileUndefined: Self = StObject.set(x, "onprocessfile", js.undefined)
    
    inline def setOnprocessfileabort(value: /* file */ FilePondFile => Callback): Self = StObject.set(x, "onprocessfileabort", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def setOnprocessfileabortUndefined: Self = StObject.set(x, "onprocessfileabort", js.undefined)
    
    inline def setOnprocessfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Callback): Self = StObject.set(x, "onprocessfileprogress", js.Any.fromFunction2((t0: /* file */ FilePondFile, t1: /* progress */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnprocessfileprogressUndefined: Self = StObject.set(x, "onprocessfileprogress", js.undefined)
    
    inline def setOnprocessfilerevert(value: /* file */ FilePondFile => Callback): Self = StObject.set(x, "onprocessfilerevert", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def setOnprocessfilerevertUndefined: Self = StObject.set(x, "onprocessfilerevert", js.undefined)
    
    inline def setOnprocessfiles(value: Callback): Self = StObject.set(x, "onprocessfiles", value.toJsFn)
    
    inline def setOnprocessfilesUndefined: Self = StObject.set(x, "onprocessfiles", js.undefined)
    
    inline def setOnprocessfilestart(value: /* file */ FilePondFile => Callback): Self = StObject.set(x, "onprocessfilestart", js.Any.fromFunction1((t0: /* file */ FilePondFile) => value(t0).runNow()))
    
    inline def setOnprocessfilestartUndefined: Self = StObject.set(x, "onprocessfilestart", js.undefined)
    
    inline def setOnremovefile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Callback): Self = StObject.set(x, "onremovefile", js.Any.fromFunction2((t0: /* error */ FilePondErrorDescription | Null, t1: /* file */ FilePondFile) => (value(t0, t1)).runNow()))
    
    inline def setOnremovefileUndefined: Self = StObject.set(x, "onremovefile", js.undefined)
    
    inline def setOnreorderfiles(value: /* files */ js.Array[FilePondFile] => Callback): Self = StObject.set(x, "onreorderfiles", js.Any.fromFunction1((t0: /* files */ js.Array[FilePondFile]) => value(t0).runNow()))
    
    inline def setOnreorderfilesUndefined: Self = StObject.set(x, "onreorderfiles", js.undefined)
    
    inline def setOnupdatefiles(value: /* files */ js.Array[FilePondFile] => Callback): Self = StObject.set(x, "onupdatefiles", js.Any.fromFunction1((t0: /* files */ js.Array[FilePondFile]) => value(t0).runNow()))
    
    inline def setOnupdatefilesUndefined: Self = StObject.set(x, "onupdatefiles", js.undefined)
    
    inline def setOnwarning(
      value: (/* error */ Any, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "onwarning", js.Any.fromFunction3((t0: /* error */ Any, t1: /* file */ js.UndefOr[FilePondFile], t2: /* status */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnwarningUndefined: Self = StObject.set(x, "onwarning", js.undefined)
  }
}
