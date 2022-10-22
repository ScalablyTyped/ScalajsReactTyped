package typingsJapgolly.fluentuiMergeStyles

import typingsJapgolly.fluentuiMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.fluentuiMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIstylefunctionMod {
  
  type IStyleFunction[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function1[/* props */ TStylesProps, DeepPartial[TStyleSet]]
  
  type IStyleFunctionOrObject[TStylesProps, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStyleFunction[TStylesProps, TStyleSet]) | DeepPartial[TStyleSet]
}
