package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CharacterFormattingScript extends StObject
/**
  * Lists values specifying character script formatting.
  */
@JSGlobal("CharacterFormattingScript")
@js.native
object CharacterFormattingScript extends StObject {
  
  /**
    * Specifies that the text is not formatted as subscript or as superscript.
    */
  @js.native
  sealed trait Normal
    extends StObject
       with CharacterFormattingScript
  
  /**
    * Formats text as subscript.
    */
  @js.native
  sealed trait Subscript
    extends StObject
       with CharacterFormattingScript
  
  /**
    * Formats text as superscript.
    */
  @js.native
  sealed trait Superscript
    extends StObject
       with CharacterFormattingScript
}
