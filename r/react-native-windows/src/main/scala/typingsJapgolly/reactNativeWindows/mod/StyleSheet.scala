package typingsJapgolly.reactNativeWindows.mod

import typingsJapgolly.reactNativeWindows.rntypesMod.RegisteredStyle
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleProp
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleSheet.AbsoluteFillStyle
import typingsJapgolly.reactNativeWindows.rntypesMod.StyleSheet.NamedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheet {
  
  @JSImport("react-native-windows", "StyleSheet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-windows", "StyleSheet.absoluteFill")
  @js.native
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  
  @JSImport("react-native-windows", "StyleSheet.absoluteFillObject")
  @js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  
  inline def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  inline def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  inline def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  inline def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(style1.asInstanceOf[js.Any], style2.asInstanceOf[js.Any])).asInstanceOf[StyleProp[T]]
  
  inline def create[T /* <: NamedStyles[Any | T] */](styles: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def create[T /* <: NamedStyles[Any | T] */](styles: NamedStyles[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def flatten[T](): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any]
  inline def flatten[T](style: StyleProp[T]): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(style.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? U : T */ js.Any]
  
  @JSImport("react-native-windows", "StyleSheet.hairlineWidth")
  @js.native
  val hairlineWidth: Double = js.native
  
  inline def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttributePreprocessor")(property.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
