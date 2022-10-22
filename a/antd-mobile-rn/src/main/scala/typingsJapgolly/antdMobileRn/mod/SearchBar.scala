package typingsJapgolly.antdMobileRn.mod

import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.OnBlur
import typingsJapgolly.antdMobileRn.libSearchBarIndexDotnativeMod.SearchBarNativeProps
import typingsJapgolly.antdMobileRn.libSearchBarIndexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "SearchBar")
@js.native
open class SearchBar protected () extends default {
  def this(props: SearchBarNativeProps) = this()
}
/* static members */
object SearchBar {
  
  @JSImport("antd-mobile-rn", "SearchBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "SearchBar.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "SearchBar.defaultProps")
  @js.native
  def defaultProps: OnBlur = js.native
  inline def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
