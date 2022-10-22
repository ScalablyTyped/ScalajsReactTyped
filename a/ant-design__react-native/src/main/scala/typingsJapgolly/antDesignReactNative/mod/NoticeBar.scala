package typingsJapgolly.antDesignReactNative.mod

import typingsJapgolly.antDesignReactNative.anon.OnPress
import typingsJapgolly.antDesignReactNative.libNoticeBarMod.NoticeNativeProps
import typingsJapgolly.antDesignReactNative.libNoticeBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "NoticeBar")
@js.native
open class NoticeBar protected () extends default {
  def this(props: NoticeNativeProps) = this()
}
/* static members */
object NoticeBar {
  
  @JSImport("@ant-design/react-native", "NoticeBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "NoticeBar.defaultProps")
  @js.native
  def defaultProps: OnPress = js.native
  inline def defaultProps_=(x: OnPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
