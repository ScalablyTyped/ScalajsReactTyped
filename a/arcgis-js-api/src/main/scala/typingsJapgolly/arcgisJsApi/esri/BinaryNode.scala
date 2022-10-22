package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.AND
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Asterisk
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.BETWEEN
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Equalssign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Greaterthansign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.GreaterthansignEqualssign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.IN
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.IS
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ISNOT
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LIKE
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Lessthansign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LessthansignEqualssign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LessthansignGreaterthansign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.NOTBETWEEN
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.OR
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Plussign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Slash
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`-_`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`NOT IN`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`NOT LIKE`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`binary-expression`
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * Escape string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
    */
  var escape: js.UndefOr[String] = js.undefined
  
  /**
    * SQL node to the left of the binary node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
    */
  var left: SQLNode
  
  /**
    * Defines the way two expressions are combined to yield a single result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
    */
  var operator: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash
  
  /**
    * SQL node to the right of the binary node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
    */
  var right: SQLNode
  
  var `type`: `binary-expression`
}
object BinaryNode {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    left: SQLNode,
    operator: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash,
    propertyIsEnumerable: PropertyKey => Boolean,
    right: SQLNode
  ): BinaryNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary-expression")
    __obj.asInstanceOf[BinaryNode]
  }
  
  extension [Self <: BinaryNode](x: Self) {
    
    inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setLeft(value: SQLNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(
      value: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: SQLNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: `binary-expression`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
