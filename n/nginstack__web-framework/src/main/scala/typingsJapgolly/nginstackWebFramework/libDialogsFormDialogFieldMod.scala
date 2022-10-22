package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackWebFramework.anon.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogsFormDialogFieldMod {
  
  inline def apply(name: Any, `type`: Any, size: Any, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dialogs/FormDialogField", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FormDialogField {
    def this(name: Any, `type`: Any, size: Any, args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _stringify: Any = js.native
    
    /* CompleteClass */
    override def assignListeners(): Unit = js.native
    
    /* CompleteClass */
    override def on(): scala.Nothing = js.native
    
    /* private */ /* CompleteClass */
    var registerEvents_ : Any = js.native
    
    /* CompleteClass */
    override def saveValuesToCache(entry: FieldName): Unit = js.native
    
    /* private */ /* CompleteClass */
    var write: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dialogs/FormDialogField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Field = typingsJapgolly.nginstackEngine.libClassdefFieldMod.^
  
  trait FormDialogField extends StObject {
    
    /* private */ var _stringify: Any
    
    def assignListeners(): Unit
    
    def on(): scala.Nothing
    
    /* private */ var registerEvents_ : Any
    
    def saveValuesToCache(entry: FieldName): Unit
    
    /* private */ var write: Any
  }
  object FormDialogField {
    
    inline def apply(
      _stringify: Any,
      assignListeners: Callback,
      on: CallbackTo[scala.Nothing],
      registerEvents_ : Any,
      saveValuesToCache: FieldName => Callback,
      write: Any
    ): FormDialogField = {
      val __obj = js.Dynamic.literal(_stringify = _stringify.asInstanceOf[js.Any], assignListeners = assignListeners.toJsFn, on = on.toJsFn, registerEvents_ = registerEvents_.asInstanceOf[js.Any], saveValuesToCache = js.Any.fromFunction1((t0: FieldName) => saveValuesToCache(t0).runNow()), write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormDialogField]
    }
    
    extension [Self <: FormDialogField](x: Self) {
      
      inline def setAssignListeners(value: Callback): Self = StObject.set(x, "assignListeners", value.toJsFn)
      
      inline def setOn(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "on", value.toJsFn)
      
      inline def setRegisterEvents_(value: Any): Self = StObject.set(x, "registerEvents_", value.asInstanceOf[js.Any])
      
      inline def setSaveValuesToCache(value: FieldName => Callback): Self = StObject.set(x, "saveValuesToCache", js.Any.fromFunction1((t0: FieldName) => value(t0).runNow()))
      
      inline def setWrite(value: Any): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def set_stringify(value: Any): Self = StObject.set(x, "_stringify", value.asInstanceOf[js.Any])
    }
  }
}
