package typingsJapgolly.antDesignReactNative.mod

import typingsJapgolly.antDesignReactNative.anon.Current
import typingsJapgolly.antDesignReactNative.libPaginationMod.PaginationNativeProps
import typingsJapgolly.antDesignReactNative.libPaginationMod.default
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Pagination")
@js.native
open class Pagination protected () extends default {
  def this(props: PaginationNativeProps) = this()
}
/* static members */
object Pagination {
  
  @JSImport("@ant-design/react-native", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Pagination.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Pagination.defaultProps")
  @js.native
  def defaultProps: Current = js.native
  inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
