package typingsJapgolly.rcEasyui.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Panel")
@js.native
open class Panel protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def bodyClasses(): Any = js.native
  
  def clickCloseTool(e: Any): Unit = js.native
  
  def clickCollapsibleTool(e: Any): Unit = js.native
  
  def clickPanelHeader(): Unit = js.native
  
  def closableClasses(): Any = js.native
  
  def collapse(): Unit = js.native
  
  def collapsibleClasses(): Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPanel(e: Any): Unit = js.native
  
  def expand(): Unit = js.native
  
  def footerClasses(): Any = js.native
  
  def hasFooter(): Any = js.native
  
  def hasHeader(): Any = js.native
  
  def headerClasses(): Any = js.native
  
  def panelBody(): Any = js.native
  
  def panelClasses(): Any = js.native
  
  def panelFooter(): Any = js.native
  
  def panelHeader(): Any = js.native
  
  def panelStyles(): Any = js.native
  
  def toggle(): Unit = js.native
}
object Panel {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.contextTypes.locale
      @JSImport("rc-easyui", "Panel.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.contextTypes.t
      @JSImport("rc-easyui", "Panel.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Panel.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.closable")
    @js.native
    val closable: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.closeIconCls")
    @js.native
    val closeIconCls: String = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.closed")
    @js.native
    val closed: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.collapseIconCls")
    @js.native
    val collapseIconCls: String = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.collapsed")
    @js.native
    val collapsed: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.collapsible")
    @js.native
    val collapsible: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.expandIconCls")
    @js.native
    val expandIconCls: String = js.native
    
    inline def onCollapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCollapse")().asInstanceOf[Unit]
    
    inline def onExpand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExpand")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Panel.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "Panel.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.animate
      @JSImport("rc-easyui", "Panel.propTypes.animate.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object bodyCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.bodyCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.bodyCls
      @JSImport("rc-easyui", "Panel.propTypes.bodyCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object bodyStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.bodyStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.bodyStyle
      @JSImport("rc-easyui", "Panel.propTypes.bodyStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object border {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.border
      @JSImport("rc-easyui", "Panel.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object closable {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.closable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.closable
      @JSImport("rc-easyui", "Panel.propTypes.closable.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object closeIconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.closeIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.closeIconCls
      @JSImport("rc-easyui", "Panel.propTypes.closeIconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object closed {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.closed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.closed
      @JSImport("rc-easyui", "Panel.propTypes.closed.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapseIconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.collapseIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.collapseIconCls
      @JSImport("rc-easyui", "Panel.propTypes.collapseIconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsed {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.collapsed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.collapsed
      @JSImport("rc-easyui", "Panel.propTypes.collapsed.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsible {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.collapsible")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.collapsible
      @JSImport("rc-easyui", "Panel.propTypes.collapsible.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object expandIconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.expandIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.expandIconCls
      @JSImport("rc-easyui", "Panel.propTypes.expandIconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footer {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.footer")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.footer
      @JSImport("rc-easyui", "Panel.propTypes.footer.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footerCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.footerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.footerCls
      @JSImport("rc-easyui", "Panel.propTypes.footerCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footerStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.footerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.footerStyle
      @JSImport("rc-easyui", "Panel.propTypes.footerStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object header {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.header")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.header
      @JSImport("rc-easyui", "Panel.propTypes.header.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object headerCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.headerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.headerCls
      @JSImport("rc-easyui", "Panel.propTypes.headerCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object headerStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.headerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.headerStyle
      @JSImport("rc-easyui", "Panel.propTypes.headerStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object iconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.iconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.iconCls
      @JSImport("rc-easyui", "Panel.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onCollapse {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.onCollapse")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.onCollapse
      @JSImport("rc-easyui", "Panel.propTypes.onCollapse.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onExpand {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.onExpand")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.onExpand
      @JSImport("rc-easyui", "Panel.propTypes.onExpand.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showFooter {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.showFooter
      @JSImport("rc-easyui", "Panel.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showHeader {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.showHeader
      @JSImport("rc-easyui", "Panel.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object title {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Panel.propTypes.title")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Panel.propTypes.title
      @JSImport("rc-easyui", "Panel.propTypes.title.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
