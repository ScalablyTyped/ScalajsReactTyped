package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.materialsFresnelParametersMod.IFresnelParametersCreationOptions
import typingsJapgolly.babylonjs.materialsFresnelParametersMod.IFresnelParametersSerialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
open class FresnelParameters ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
object FresnelParameters {
  
  @JSImport("babylonjs", "FresnelParameters")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  inline def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typingsJapgolly.babylonjs.materialsFresnelParametersMod.FresnelParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedFresnelParameters.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.materialsFresnelParametersMod.FresnelParameters]
}
