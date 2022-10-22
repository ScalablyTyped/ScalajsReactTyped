package typingsJapgolly.scrivito.mod

import typingsJapgolly.scrivito.anon.Attributes
import typingsJapgolly.scrivito.anon.IncludeObjs
import typingsJapgolly.scrivito.scrivitoStrings.asc
import typingsJapgolly.scrivito.scrivitoStrings.desc
import typingsJapgolly.scrivito.scrivitoStrings.equals
import typingsJapgolly.scrivito.scrivitoStrings.isGreaterThan
import typingsJapgolly.scrivito.scrivitoStrings.isLessThan
import typingsJapgolly.scrivito.scrivitoStrings.startsWith
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjSearch extends StObject {
  
  def and(attribute: ObjSearchAttribute, operator: ObjSearchOperator, value: ObjSearchValue): ObjSearch = js.native
  def and(
    attribute: ObjSearchAttribute,
    operator: ObjSearchOperator,
    value: ObjSearchValue,
    boost: ObjSearchAttributeBasedBoost
  ): ObjSearch = js.native
  
  def andNot(
    attribute: ObjSearchAttribute,
    operator: Extract[ObjSearchOperator, equals | startsWith | isGreaterThan | isLessThan],
    value: ObjSearchValue
  ): ObjSearch = js.native
  
  def boost(attribute: ObjSearchAttribute, operator: ObjSearchOperator, value: ObjSearchValue, factor: Double): ObjSearch = js.native
  
  def count(): Double = js.native
  
  def facet(attribute: ObjSearchSingleAttribute): ObjFacetValue = js.native
  def facet(attribute: ObjSearchSingleAttribute, option: IncludeObjs): ObjFacetValue = js.native
  
  def first(): Obj | Null = js.native
  
  def offset(offSet: Double): ObjSearch = js.native
  
  def order(attributeOrAttributes: js.Array[OrderParam], direction: asc | desc): ObjSearch = js.native
  def order(attributeOrAttributes: OrderParam, direction: asc | desc): ObjSearch = js.native
  
  def suggest(prefix: String): js.Array[String] = js.native
  def suggest(prefix: String, options: Attributes): js.Array[String] = js.native
  
  def take(): js.Array[Obj] = js.native
  def take(count: Double): js.Array[Obj] = js.native
  
  def toArray(): js.Array[Obj] = js.native
}
