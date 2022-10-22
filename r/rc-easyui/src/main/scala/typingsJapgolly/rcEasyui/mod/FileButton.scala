package typingsJapgolly.rcEasyui.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "FileButton")
@js.native
open class FileButton protected ()
  extends Component[Any, js.Object, Any] {
  def this(args: Any*) = this()
  
  def clear(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MFileButton(): Unit = js.native
  
  def getFiles(): Any = js.native
  
  def handleFileSelect(): Unit = js.native
  
  def renderOthers(): Any = js.native
  
  def upload(): Unit = js.native
}
/* static members */
object FileButton {
  
  @JSImport("rc-easyui", "FileButton")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.contextTypes.locale
      @JSImport("rc-easyui", "FileButton.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.contextTypes.t
      @JSImport("rc-easyui", "FileButton.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "FileButton.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.autoUpload")
    @js.native
    val autoUpload: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.href")
    @js.native
    val href: String = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.iconAlign")
    @js.native
    val iconAlign: String = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.method")
    @js.native
    val method: String = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.multiple")
    @js.native
    val multiple: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.name")
    @js.native
    val name: String = js.native
    
    inline def onClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick")().asInstanceOf[Unit]
    
    inline def onError(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onError")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onProgress(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onProgress")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onSelect(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelect")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onSuccess(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSuccess")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "FileButton.defaultProps.outline")
    @js.native
    val outline: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.plain")
    @js.native
    val plain: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.selected")
    @js.native
    val selected: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.size")
    @js.native
    val size: String = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.toggle")
    @js.native
    val toggle: Boolean = js.native
    
    @JSImport("rc-easyui", "FileButton.defaultProps.withCredentials")
    @js.native
    val withCredentials: Boolean = js.native
  }
  
  @JSImport("rc-easyui", "FileButton.fileId")
  @js.native
  def fileId: Double = js.native
  inline def fileId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileId")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object accept {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.accept")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.accept
      @JSImport("rc-easyui", "FileButton.propTypes.accept.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object autoUpload {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.autoUpload")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.autoUpload
      @JSImport("rc-easyui", "FileButton.propTypes.autoUpload.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object capture {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.capture")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.capture
      @JSImport("rc-easyui", "FileButton.propTypes.capture.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object className {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.className
      @JSImport("rc-easyui", "FileButton.propTypes.className.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object disabled {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.disabled")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.disabled
      @JSImport("rc-easyui", "FileButton.propTypes.disabled.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object href {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.href")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.href
      @JSImport("rc-easyui", "FileButton.propTypes.href.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object iconAlign {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.iconAlign")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.iconAlign
      @JSImport("rc-easyui", "FileButton.propTypes.iconAlign.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object iconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.iconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.iconCls
      @JSImport("rc-easyui", "FileButton.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object method {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.method")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.method
      @JSImport("rc-easyui", "FileButton.propTypes.method.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object multiple {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.multiple")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.multiple
      @JSImport("rc-easyui", "FileButton.propTypes.multiple.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onClick {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.onClick")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.onClick
      @JSImport("rc-easyui", "FileButton.propTypes.onClick.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object outline {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.outline")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.outline
      @JSImport("rc-easyui", "FileButton.propTypes.outline.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object plain {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.plain")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.plain
      @JSImport("rc-easyui", "FileButton.propTypes.plain.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selected {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.selected")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.selected
      @JSImport("rc-easyui", "FileButton.propTypes.selected.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object size {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.size")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.size
      @JSImport("rc-easyui", "FileButton.propTypes.size.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object style {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.style
      @JSImport("rc-easyui", "FileButton.propTypes.style.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object text {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.text")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.text
      @JSImport("rc-easyui", "FileButton.propTypes.text.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object toggle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.toggle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.toggle
      @JSImport("rc-easyui", "FileButton.propTypes.toggle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object url {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.url")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.url
      @JSImport("rc-easyui", "FileButton.propTypes.url.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object withCredentials {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "FileButton.propTypes.withCredentials")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.FileButton.propTypes.withCredentials
      @JSImport("rc-easyui", "FileButton.propTypes.withCredentials.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
