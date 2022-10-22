package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
open class PullContainerSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullContainerSymbol {
  def this(name: String, kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullContainerSymbol {
  
  @JSGlobal("TypeScript.PullContainerSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def usedAsSymbol(
    containerSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("usedAsSymbol")(containerSymbol.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
