package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.wordpressComponents.noticeListMod.NoticeList.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeList {
  
  inline def apply(notices: js.Array[typingsJapgolly.wordpressComponents.noticeListMod.NoticeList.Notice]): SharedBuilder_Props1255823516 = {
    val __props = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
    new SharedBuilder_Props1255823516(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "NoticeList")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1255823516 = new SharedBuilder_Props1255823516(js.Array(this.component, p.asInstanceOf[js.Any]))
}
