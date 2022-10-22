package typingsJapgolly.rcEasyui.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "VirtualScroll")
@js.native
open class VirtualScroll protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MVirtualScroll(): Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MVirtualScroll(e: Any): Unit = js.native
  
  def fetchPage(e: Any): Unit = js.native
  
  def handleScroll(e: Any): Unit = js.native
  
  def loadPage(e: Any): Unit = js.native
  
  def populate(e: Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def relativeScrollTop(): Any = js.native
  
  def renderContent(): Any = js.native
  
  def resetData(e: Any): Unit = js.native
  
  def scrollLeft(e: Any): Any = js.native
  
  def scrollState(e: Any): Any = js.native
  
  def scrollTop(e: Any): Any = js.native
  
  def scrollbarWidth(): Any = js.native
  
  def scrolling(): Unit = js.native
  
  def setData(e: Any): Unit = js.native
  
  def splitHeights(e: Any): Any = js.native
}
object VirtualScroll {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.contextTypes.locale
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.contextTypes.t
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.data")
    @js.native
    val data: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.maxDivHeight")
    @js.native
    val maxDivHeight: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.maxVisibleHeight")
    @js.native
    val maxVisibleHeight: Double = js.native
    
    inline def onBodyScroll(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBodyScroll")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPageChange(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onUpdate(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUpdate")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.rowHeight")
    @js.native
    val rowHeight: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.total")
    @js.native
    val total: Double = js.native
  }
  
  object propTypes {
    
    object data {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.data
      @JSImport("rc-easyui", "VirtualScroll.propTypes.data.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object `lazy` {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.lazy")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.lazy
      @JSImport("rc-easyui", "VirtualScroll.propTypes.lazy.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object maxDivHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxDivHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.maxDivHeight
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxDivHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object maxVisibleHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxVisibleHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.maxVisibleHeight
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxVisibleHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onPageChange {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onPageChange")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.onPageChange
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onPageChange.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onUpdate {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onUpdate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.onUpdate
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onUpdate.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageNumber {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageNumber")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.pageNumber
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageSize {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.pageSize
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object renderItem {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItem")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.renderItem
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItem.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object renderItems {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItems")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.renderItems
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItems.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object reset {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.reset")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.reset
      @JSImport("rc-easyui", "VirtualScroll.propTypes.reset.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object rowHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.rowHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.rowHeight
      @JSImport("rc-easyui", "VirtualScroll.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object total {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.total")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.total
      @JSImport("rc-easyui", "VirtualScroll.propTypes.total.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
