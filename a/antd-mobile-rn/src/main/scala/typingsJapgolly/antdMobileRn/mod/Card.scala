package typingsJapgolly.antdMobileRn.mod

import typingsJapgolly.antdMobileRn.anon.Full
import typingsJapgolly.antdMobileRn.anon.TypeofCardBody
import typingsJapgolly.antdMobileRn.anon.TypeofCardFooter
import typingsJapgolly.antdMobileRn.anon.TypeofCardHeader
import typingsJapgolly.antdMobileRn.libCardIndexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Card")
@js.native
open class Card () extends default
/* static members */
object Card {
  
  @JSImport("antd-mobile-rn", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Card.Body")
  @js.native
  def Body: TypeofCardBody = js.native
  inline def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Card.Footer")
  @js.native
  def Footer: TypeofCardFooter = js.native
  inline def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Card.Header")
  @js.native
  def Header: TypeofCardHeader = js.native
  inline def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Card.defaultProps")
  @js.native
  def defaultProps: Full = js.native
  inline def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
