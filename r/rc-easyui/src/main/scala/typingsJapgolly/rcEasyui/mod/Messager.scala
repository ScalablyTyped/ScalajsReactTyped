package typingsJapgolly.rcEasyui.mod

import typingsJapgolly.rcEasyui.anon.Buttons
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Messager")
@js.native
open class Messager protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def alert(e: Any): Unit = js.native
  
  def close(e: Any): Unit = js.native
  
  def confirm(e: Any): Unit = js.native
  
  def openDialog(e: Any, args: Any*): Unit = js.native
  
  def prompt(e: Any): Unit = js.native
}
/* static members */
object Messager {
  
  @JSImport("rc-easyui", "Messager")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.contextTypes.locale
      @JSImport("rc-easyui", "Messager.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.contextTypes.t
      @JSImport("rc-easyui", "Messager.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  @JSImport("rc-easyui", "Messager.defaultProps")
  @js.native
  def defaultProps: Buttons = js.native
  inline def defaultProps_=(x: Buttons): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object buttons {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.buttons")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.buttons
      @JSImport("rc-easyui", "Messager.propTypes.buttons.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object className {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.className
      @JSImport("rc-easyui", "Messager.propTypes.className.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object content {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.content")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.content
      @JSImport("rc-easyui", "Messager.propTypes.content.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object icon {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.icon")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.icon
      @JSImport("rc-easyui", "Messager.propTypes.icon.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object messagerType {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.messagerType")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.messagerType
      @JSImport("rc-easyui", "Messager.propTypes.messagerType.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object msg {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.msg")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.msg
      @JSImport("rc-easyui", "Messager.propTypes.msg.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object style {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Messager.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Messager.propTypes.style
      @JSImport("rc-easyui", "Messager.propTypes.style.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
