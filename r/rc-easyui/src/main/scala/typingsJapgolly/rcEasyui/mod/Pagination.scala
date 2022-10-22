package typingsJapgolly.rcEasyui.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Pagination")
@js.native
open class Pagination protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def adjustPage(): Unit = js.native
  
  def afterPageText(): Any = js.native
  
  def beforePageText(): Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MPagination(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPagination(e: Any): Unit = js.native
  
  def handleButtonClick(e: Any): Unit = js.native
  
  def handleLinkChange(e: Any): Unit = js.native
  
  def handleListChange(e: Any): Unit = js.native
  
  def handlePageInput(e: Any): Unit = js.native
  
  def isButton(e: Any): Any = js.native
  
  def pageCount(): Any = js.native
  
  def pageInfo(): Any = js.native
  
  def refreshPage(): Unit = js.native
  
  def renderLayout(e: Any, t: Any): Any = js.native
  
  def selectPage(e: Any): Unit = js.native
}
object Pagination {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.contextTypes.locale
      @JSImport("rc-easyui", "Pagination.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.contextTypes.t
      @JSImport("rc-easyui", "Pagination.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Pagination.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.defaultAfterPageText")
    @js.native
    val defaultAfterPageText: String = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.defaultBeforePageText")
    @js.native
    val defaultBeforePageText: String = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.defaultDisplayMsg")
    @js.native
    val defaultDisplayMsg: String = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.layout")
    @js.native
    val layout: js.Array[String] = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.links")
    @js.native
    val links: Double = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.loading")
    @js.native
    val loading: Boolean = js.native
    
    inline def onPageChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageChange")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Pagination.defaultProps.pageList")
    @js.native
    val pageList: js.Array[Double] = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.showPageInfo")
    @js.native
    val showPageInfo: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.showPageList")
    @js.native
    val showPageList: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.showPageRefresh")
    @js.native
    val showPageRefresh: Boolean = js.native
    
    @JSImport("rc-easyui", "Pagination.defaultProps.total")
    @js.native
    val total: Double = js.native
  }
  
  object propTypes {
    
    object afterPageText {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.afterPageText")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.afterPageText
      @JSImport("rc-easyui", "Pagination.propTypes.afterPageText.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object beforePageText {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.beforePageText")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.beforePageText
      @JSImport("rc-easyui", "Pagination.propTypes.beforePageText.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object displayMsg {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.displayMsg")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.displayMsg
      @JSImport("rc-easyui", "Pagination.propTypes.displayMsg.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object layout {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.layout")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.layout
      @JSImport("rc-easyui", "Pagination.propTypes.layout.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object links {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.links")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.links
      @JSImport("rc-easyui", "Pagination.propTypes.links.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object loading {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.loading")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.loading
      @JSImport("rc-easyui", "Pagination.propTypes.loading.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onPageChange {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.onPageChange")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.onPageChange
      @JSImport("rc-easyui", "Pagination.propTypes.onPageChange.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageList {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.pageList")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.pageList
      @JSImport("rc-easyui", "Pagination.propTypes.pageList.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageNumber {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.pageNumber")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.pageNumber
      @JSImport("rc-easyui", "Pagination.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object pageSize {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.pageSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.pageSize
      @JSImport("rc-easyui", "Pagination.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object renderExt {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.renderExt")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.renderExt
      @JSImport("rc-easyui", "Pagination.propTypes.renderExt.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showPageInfo {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.showPageInfo")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.showPageInfo
      @JSImport("rc-easyui", "Pagination.propTypes.showPageInfo.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showPageList {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.showPageList")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.showPageList
      @JSImport("rc-easyui", "Pagination.propTypes.showPageList.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showPageRefresh {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.showPageRefresh")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.showPageRefresh
      @JSImport("rc-easyui", "Pagination.propTypes.showPageRefresh.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object total {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Pagination.propTypes.total")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Pagination.propTypes.total
      @JSImport("rc-easyui", "Pagination.propTypes.total.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
