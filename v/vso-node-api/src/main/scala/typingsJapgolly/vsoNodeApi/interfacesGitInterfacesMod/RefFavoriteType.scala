package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RefFavoriteType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "RefFavoriteType")
@js.native
object RefFavoriteType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RefFavoriteType & Double] = js.native
  
  @js.native
  sealed trait Folder
    extends StObject
       with RefFavoriteType
  /* 1 */ val Folder: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.RefFavoriteType.Folder & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with RefFavoriteType
  /* 0 */ val Invalid: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.RefFavoriteType.Invalid & Double = js.native
  
  @js.native
  sealed trait Ref
    extends StObject
       with RefFavoriteType
  /* 2 */ val Ref: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.RefFavoriteType.Ref & Double = js.native
}
