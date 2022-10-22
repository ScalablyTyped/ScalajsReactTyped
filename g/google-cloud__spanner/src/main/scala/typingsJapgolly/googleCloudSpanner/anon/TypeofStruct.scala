package typingsJapgolly.googleCloudSpanner.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.googleCloudSpanner.buildSrcCodecMod.Field
import typingsJapgolly.googleCloudSpanner.buildSrcCodecMod.Json
import typingsJapgolly.googleCloudSpanner.buildSrcCodecMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStruct
  extends StObject
     with Instantiable0[Struct] {
  
  /**
    * Converts an array of fields to a struct.
    *
    * @private
    *
    * @param {object[]} fields List of struct fields.
    * @return {Struct}
    */
  def fromArray(fields: js.Array[Field]): Struct = js.native
  
  /**
    * Converts a JSON object to a struct.
    *
    * @private
    *
    * @param {object} json Struct JSON.
    * @return {Struct}
    */
  def fromJSON(json: Json): Struct = js.native
}
