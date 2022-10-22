package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Ampersand
import typingsJapgolly.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsJapgolly.babelTypes.babelTypesStrings.Asterisk
import typingsJapgolly.babelTypes.babelTypesStrings.AsteriskAsterisk
import typingsJapgolly.babelTypes.babelTypesStrings.EqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.Greaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsJapgolly.babelTypes.babelTypesStrings.Lessthansign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignEqualssign
import typingsJapgolly.babelTypes.babelTypesStrings.LessthansignLessthansign
import typingsJapgolly.babelTypes.babelTypesStrings.Percentsign
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.Slash
import typingsJapgolly.babelTypes.babelTypesStrings.Verticalline
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineVerticalline
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import typingsJapgolly.babelTypes.babelTypesStrings.in
import typingsJapgolly.babelTypes.babelTypesStrings.instanceof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.BinaryExpression_
  - typingsJapgolly.babelTypes.mod.LogicalExpression_
*/
trait Binary extends StObject
object Binary {
  
  inline def BinaryExpression_(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typingsJapgolly.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double
  ): typingsJapgolly.babelTypes.mod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BinaryExpression_]
  }
  
  inline def LogicalExpression_(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: VerticallineVerticalline | AmpersandAmpersand,
    right: Expression,
    start: Double
  ): typingsJapgolly.babelTypes.mod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.LogicalExpression_]
  }
}
