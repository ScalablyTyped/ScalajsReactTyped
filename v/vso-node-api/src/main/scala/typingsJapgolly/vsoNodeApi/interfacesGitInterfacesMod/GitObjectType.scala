package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitObjectType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitObjectType")
@js.native
object GitObjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitObjectType & Double] = js.native
  
  @js.native
  sealed trait Bad
    extends StObject
       with GitObjectType
  /* 0 */ val Bad: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.Bad & Double = js.native
  
  @js.native
  sealed trait Blob
    extends StObject
       with GitObjectType
  /* 3 */ val Blob: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.Blob & Double = js.native
  
  @js.native
  sealed trait Commit
    extends StObject
       with GitObjectType
  /* 1 */ val Commit: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.Commit & Double = js.native
  
  @js.native
  sealed trait Ext2
    extends StObject
       with GitObjectType
  /* 5 */ val Ext2: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.Ext2 & Double = js.native
  
  @js.native
  sealed trait OfsDelta
    extends StObject
       with GitObjectType
  /* 6 */ val OfsDelta: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.OfsDelta & Double = js.native
  
  @js.native
  sealed trait RefDelta
    extends StObject
       with GitObjectType
  /* 7 */ val RefDelta: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.RefDelta & Double = js.native
  
  @js.native
  sealed trait Tag
    extends StObject
       with GitObjectType
  /* 4 */ val Tag: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.Tag & Double = js.native
  
  @js.native
  sealed trait Tree
    extends StObject
       with GitObjectType
  /* 2 */ val Tree: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitObjectType.Tree & Double = js.native
}
