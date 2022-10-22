package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentType")
@js.native
object CommentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentType & Double] = js.native
  
  /**
    * The comment comes as a result of a code change.
    */
  @js.native
  sealed trait CodeChange
    extends StObject
       with CommentType
  /* 2 */ val CodeChange: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.CommentType.CodeChange & Double = js.native
  
  /**
    * The comment represents a system message.
    */
  @js.native
  sealed trait System
    extends StObject
       with CommentType
  /* 3 */ val System: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.CommentType.System & Double = js.native
  
  /**
    * This is a regular user comment.
    */
  @js.native
  sealed trait Text
    extends StObject
       with CommentType
  /* 1 */ val Text: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.CommentType.Text & Double = js.native
  
  /**
    * The comment type is not known.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with CommentType
  /* 0 */ val Unknown: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.CommentType.Unknown & Double = js.native
}
