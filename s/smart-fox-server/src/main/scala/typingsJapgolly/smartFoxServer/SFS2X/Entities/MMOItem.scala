package typingsJapgolly.smartFoxServer.SFS2X.Entities

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Variables.MMOItemVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MMOItem extends StObject {
  
  /** @type {Data.Vec3D} Returns the entry point of this item in the current user's AoI. */
  var aoiEnteryPoint: Vec3D
  
  /**
    * Indicates whether this item has the specified MMOItem Variable set or not.
    * @param  {string}  varName The name of the MMOItem Variable whose existance must be checked.
    * @return {boolean}         Returns: true if an MMOItem Variable with the passed name is set for this item.
    */
  def containsVariable(varName: String): Boolean
  
  /**
    * Retrieves an MMOItem Variable from its name.
    * @param  {string}                    varName The name of the MMOItem Variable to be retrieved.
    * @return {Variables.MMOItemVariable}         The MMOItemVariable object, or null if no MMOItem Variable with the passed name is associated to this item.
    */
  def getVariable(varName: String): MMOItemVariable
  
  /**
    * Retrieves all the MMOItem Variables of this item.
    * @return {Variables.MMOItemVariable[]} The list of MMOItemVariable objects associated to this item.
    */
  def getVariables(): js.Array[MMOItemVariable]
  
  /** @type {number} Indicates the id of this item. */
  var id: Double
}
object MMOItem {
  
  inline def apply(
    aoiEnteryPoint: Vec3D,
    containsVariable: String => Boolean,
    getVariable: String => MMOItemVariable,
    getVariables: CallbackTo[js.Array[MMOItemVariable]],
    id: Double
  ): MMOItem = {
    val __obj = js.Dynamic.literal(aoiEnteryPoint = aoiEnteryPoint.asInstanceOf[js.Any], containsVariable = js.Any.fromFunction1(containsVariable), getVariable = js.Any.fromFunction1(getVariable), getVariables = getVariables.toJsFn, id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MMOItem]
  }
  
  extension [Self <: MMOItem](x: Self) {
    
    inline def setAoiEnteryPoint(value: Vec3D): Self = StObject.set(x, "aoiEnteryPoint", value.asInstanceOf[js.Any])
    
    inline def setContainsVariable(value: String => Boolean): Self = StObject.set(x, "containsVariable", js.Any.fromFunction1(value))
    
    inline def setGetVariable(value: String => MMOItemVariable): Self = StObject.set(x, "getVariable", js.Any.fromFunction1(value))
    
    inline def setGetVariables(value: CallbackTo[js.Array[MMOItemVariable]]): Self = StObject.set(x, "getVariables", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
