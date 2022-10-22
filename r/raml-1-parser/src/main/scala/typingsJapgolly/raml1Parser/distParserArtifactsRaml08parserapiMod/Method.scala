package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method
  extends StObject
     with MethodBase {
  
  /**
    * Returns security schemes, resource or method is secured with. If no security schemes are set at resource or method level,
    * returns schemes defined with `securedBy` at API level.
    * @deprecated
    **/
  def allSecuredBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * Instantiation of applyed traits
    **/
  def is(): js.Array[TraitRef] = js.native
  
  /**
    * Method that can be called
    **/
  def method(): String = js.native
  
  /**
    * For methods of Resources: `{parent Resource relative path} {methodName}`.
    * For methods of ResourceTypes: `{parent ResourceType name} {methodName}`.
    * For other methods throws Exception.
    **/
  def methodId(): String = js.native
  
  /**
    * Api owning the resource as a sibling
    **/
  def ownerApi(): Api = js.native
  
  /**
    * For methods defined inside resource types returns object representation of parametrized properties
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * For methods of Resources returns parent resource. For methods of ResourceTypes returns null.
    **/
  def parentResource(): Resource = js.native
}
