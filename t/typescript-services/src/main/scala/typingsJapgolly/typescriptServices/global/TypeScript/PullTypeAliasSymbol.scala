package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullTypeAliasSymbol")
@js.native
open class PullTypeAliasSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullTypeAliasSymbol {
  def this(name: String) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
