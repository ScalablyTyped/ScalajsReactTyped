package typingsJapgolly.styledComponents

import typingsJapgolly.styledComponents.nativeDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistUtilsFlattenMod {
  
  @JSImport("styled-components/native/dist/utils/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](chunk: Interpolation[Props]): Interpolation[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any]).asInstanceOf[Interpolation[Props]]
  inline def default[Props](chunk: Interpolation[Props], executionContext: ExecutionContext & Props): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: ExecutionContext & Props,
    styleSheet: Unit,
    stylisInstance: Stringifier
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: ExecutionContext & Props,
    styleSheet: typingsJapgolly.styledComponents.nativeDistSheetMod.default
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: ExecutionContext & Props,
    styleSheet: typingsJapgolly.styledComponents.nativeDistSheetMod.default,
    stylisInstance: Stringifier
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](chunk: Interpolation[Props], executionContext: Unit, styleSheet: Unit, stylisInstance: Stringifier): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: Unit,
    styleSheet: typingsJapgolly.styledComponents.nativeDistSheetMod.default
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: Unit,
    styleSheet: typingsJapgolly.styledComponents.nativeDistSheetMod.default,
    stylisInstance: Stringifier
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  
  inline def objToCssArray(obj: ExtensibleObject): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objToCssArray")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def objToCssArray(obj: ExtensibleObject, prevKey: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("objToCssArray")(obj.asInstanceOf[js.Any], prevKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
