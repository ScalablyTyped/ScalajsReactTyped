package typingsJapgolly.typescriptServices.mod.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.DefinitionInfo")
@js.native
open class DefinitionInfo protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.DefinitionInfo {
  def this(
    fileName: String,
    minChar: Double,
    limChar: Double,
    kind: String,
    name: String,
    containerKind: String,
    containerName: String
  ) = this()
  
  /* CompleteClass */
  var containerKind: String = js.native
  
  /* CompleteClass */
  var containerName: String = js.native
  
  /* CompleteClass */
  var fileName: String = js.native
  
  /* CompleteClass */
  var kind: String = js.native
  
  /* CompleteClass */
  var limChar: Double = js.native
  
  /* CompleteClass */
  var minChar: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
