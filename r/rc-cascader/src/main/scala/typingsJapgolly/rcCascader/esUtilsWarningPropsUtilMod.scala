package typingsJapgolly.rcCascader

import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.rcCascader.esCascaderMod.FieldNames
import typingsJapgolly.rcCascader.esCascaderMod.InternalCascaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsWarningPropsUtilMod {
  
  @JSImport("rc-cascader/es/utils/warningPropsUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: InternalCascaderProps[DefaultOptionType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warningNullOptions(options: js.Array[DefaultOptionType], fieldNames: FieldNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warningNullOptions")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
