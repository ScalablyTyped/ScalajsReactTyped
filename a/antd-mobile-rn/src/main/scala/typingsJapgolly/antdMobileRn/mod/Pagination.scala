package typingsJapgolly.antdMobileRn.mod

import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.Current
import typingsJapgolly.antdMobileRn.libPaginationIndexDotnativeMod.PaginationNativeProps
import typingsJapgolly.antdMobileRn.libPaginationIndexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Pagination")
@js.native
open class Pagination protected () extends default {
  def this(props: PaginationNativeProps) = this()
}
/* static members */
object Pagination {
  
  @JSImport("antd-mobile-rn", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Pagination.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Pagination.defaultProps")
  @js.native
  def defaultProps: Current = js.native
  inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
