package typingsJapgolly.naverWhale.whale

import org.scalajs.dom.ImageData
import typingsJapgolly.chrome.chrome.events.Event
import typingsJapgolly.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarAction {
  
  trait BadgeBackgroundColorDetails extends StObject {
    
    /** 색상값 배열([255, 0, 0, 255]) 혹은 HEX 색상 표현 문자열(#FF0000). */
    var color: String | ColorArray
  }
  object BadgeBackgroundColorDetails {
    
    inline def apply(color: String | ColorArray): BadgeBackgroundColorDetails = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeBackgroundColorDetails]
    }
    
    extension [Self <: BadgeBackgroundColorDetails](x: Self) {
      
      inline def setColor(value: String | ColorArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  type BrowserClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
  
  trait SidebarBadgeDetail extends StObject {
    
    /** 설정할 badge 문자열 */
    var text: String
  }
  object SidebarBadgeDetail {
    
    inline def apply(text: String): SidebarBadgeDetail = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarBadgeDetail]
    }
    
    extension [Self <: SidebarBadgeDetail](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SidebarDockDetail extends StObject {
    
    /** 부모 윈도우의 ID. 지정하지 않으면 마지막 사용된 윈도우에 도킹합니다. */
    var targetWindowId: js.UndefOr[Double] = js.undefined
  }
  object SidebarDockDetail {
    
    inline def apply(): SidebarDockDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarDockDetail]
    }
    
    extension [Self <: SidebarDockDetail](x: Self) {
      
      inline def setTargetWindowId(value: Double): Self = StObject.set(x, "targetWindowId", value.asInstanceOf[js.Any])
      
      inline def setTargetWindowIdUndefined: Self = StObject.set(x, "targetWindowId", js.undefined)
    }
  }
  
  trait SidebarIconDetail extends StObject {
    
    /**
      * 아이콘 이미지 데이터입니다. @see https://developer.chrome.com/extensions/pageAction#type-ImageDataType
      * */
    var icon: ImageData
  }
  object SidebarIconDetail {
    
    inline def apply(icon: ImageData): SidebarIconDetail = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarIconDetail]
    }
    
    extension [Self <: SidebarIconDetail](x: Self) {
      
      inline def setIcon(value: ImageData): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  trait SidebarPageDetail extends StObject {
    
    /** html 파일의 리소스 경로. 빈 문자열(‘’)로 설정하면 사이드바에 빈화면이 보입니다. */
    var page: String
  }
  object SidebarPageDetail {
    
    inline def apply(page: String): SidebarPageDetail = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarPageDetail]
    }
    
    extension [Self <: SidebarPageDetail](x: Self) {
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait SidebarShowDetail extends StObject {
    
    /**
      * Optional. url 인자와 현재 URL이 같을 때에도 페이지를 새로고침 할 것인지 여부.
      * @default false
      */
    var reload: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. 사이드바 영역에 표시할 페이지 URL. 지정하지 않으면 매니페스트에 정의한 default_page. */
    var url: js.UndefOr[String] = js.undefined
  }
  object SidebarShowDetail {
    
    inline def apply(): SidebarShowDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarShowDetail]
    }
    
    extension [Self <: SidebarShowDetail](x: Self) {
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SidebarTitleDetail extends StObject {
    
    var title: String
  }
  object SidebarTitleDetail {
    
    inline def apply(title: String): SidebarTitleDetail = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarTitleDetail]
    }
    
    extension [Self <: SidebarTitleDetail](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
