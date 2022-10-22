package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.File
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseDropMod {
  
  @JSImport("ahooks/lib/useDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: BasicTarget[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(target: BasicTarget[Element], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var onDom: js.UndefOr[
        js.Function2[/* content */ Any, /* event */ js.UndefOr[ReactDragEventFrom[Element]], Unit]
      ] = js.undefined
    
    var onDragEnter: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactDragEventFrom[Element]], Unit]] = js.undefined
    
    var onDragLeave: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactDragEventFrom[Element]], Unit]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactDragEventFrom[Element]], Unit]] = js.undefined
    
    var onDrop: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactDragEventFrom[Element]], Unit]] = js.undefined
    
    var onFiles: js.UndefOr[
        js.Function2[
          /* files */ js.Array[File], 
          /* event */ js.UndefOr[ReactDragEventFrom[Element]], 
          Unit
        ]
      ] = js.undefined
    
    var onPaste: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactClipboardEventFrom[Element]], Unit]] = js.undefined
    
    var onText: js.UndefOr[
        js.Function2[/* text */ String, /* event */ js.UndefOr[ReactClipboardEventFrom[Element]], Unit]
      ] = js.undefined
    
    var onUri: js.UndefOr[
        js.Function2[/* url */ String, /* event */ js.UndefOr[ReactDragEventFrom[Element]], Unit]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnDom(value: (/* content */ Any, /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => Callback): Self = StObject.set(x, "onDom", js.Any.fromFunction2((t0: /* content */ Any, t1: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => (value(t0, t1)).runNow()))
      
      inline def setOnDomUndefined: Self = StObject.set(x, "onDom", js.undefined)
      
      inline def setOnDragEnter(value: /* event */ js.UndefOr[ReactDragEventFrom[Element]] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: /* event */ js.UndefOr[ReactDragEventFrom[Element]] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: /* event */ js.UndefOr[ReactDragEventFrom[Element]] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDrop(value: /* event */ js.UndefOr[ReactDragEventFrom[Element]] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnFiles(
        value: (/* files */ js.Array[File], /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => Callback
      ): Self = StObject.set(x, "onFiles", js.Any.fromFunction2((t0: /* files */ js.Array[File], t1: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => (value(t0, t1)).runNow()))
      
      inline def setOnFilesUndefined: Self = StObject.set(x, "onFiles", js.undefined)
      
      inline def setOnPaste(value: /* event */ js.UndefOr[ReactClipboardEventFrom[Element]] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactClipboardEventFrom[Element]]) => value(t0).runNow()))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnText(value: (/* text */ String, /* event */ js.UndefOr[ReactClipboardEventFrom[Element]]) => Callback): Self = StObject.set(x, "onText", js.Any.fromFunction2((t0: /* text */ String, t1: /* event */ js.UndefOr[ReactClipboardEventFrom[Element]]) => (value(t0, t1)).runNow()))
      
      inline def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
      
      inline def setOnUri(value: (/* url */ String, /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => Callback): Self = StObject.set(x, "onUri", js.Any.fromFunction2((t0: /* url */ String, t1: /* event */ js.UndefOr[ReactDragEventFrom[Element]]) => (value(t0, t1)).runNow()))
      
      inline def setOnUriUndefined: Self = StObject.set(x, "onUri", js.undefined)
    }
  }
}
