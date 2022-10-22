package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlChangeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with VersionControlChangeType
  /* 1 */ val Add: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Add & Double = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with VersionControlChangeType
  /* 8191 */ val All: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.All & Double = js.native
  
  @js.native
  sealed trait Branch
    extends StObject
       with VersionControlChangeType
  /* 64 */ val Branch: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Branch & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with VersionControlChangeType
  /* 16 */ val Delete: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Delete & Double = js.native
  
  @js.native
  sealed trait Edit
    extends StObject
       with VersionControlChangeType
  /* 2 */ val Edit: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Edit & Double = js.native
  
  @js.native
  sealed trait Encoding
    extends StObject
       with VersionControlChangeType
  /* 4 */ val Encoding: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Encoding & Double = js.native
  
  @js.native
  sealed trait Lock
    extends StObject
       with VersionControlChangeType
  /* 256 */ val Lock: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Lock & Double = js.native
  
  @js.native
  sealed trait Merge
    extends StObject
       with VersionControlChangeType
  /* 128 */ val Merge: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Merge & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with VersionControlChangeType
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.None & Double = js.native
  
  @js.native
  sealed trait Property
    extends StObject
       with VersionControlChangeType
  /* 4096 */ val Property: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Property & Double = js.native
  
  @js.native
  sealed trait Rename
    extends StObject
       with VersionControlChangeType
  /* 8 */ val Rename: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Rename & Double = js.native
  
  @js.native
  sealed trait Rollback
    extends StObject
       with VersionControlChangeType
  /* 512 */ val Rollback: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Rollback & Double = js.native
  
  @js.native
  sealed trait SourceRename
    extends StObject
       with VersionControlChangeType
  /* 1024 */ val SourceRename: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.SourceRename & Double = js.native
  
  @js.native
  sealed trait TargetRename
    extends StObject
       with VersionControlChangeType
  /* 2048 */ val TargetRename: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.TargetRename & Double = js.native
  
  @js.native
  sealed trait Undelete
    extends StObject
       with VersionControlChangeType
  /* 32 */ val Undelete: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Undelete & Double = js.native
}
