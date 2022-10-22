package typingsJapgolly.parseConflictJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse a JSON string that has git merge conflicts, resolving if possible.
    * If the JSON is valid, it just does JSON.parse as normal.
    * If either side of the conflict is invalid JSON, then an error is thrown for that.
    */
  inline def apply(text: String): Any = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(text: String, reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    text: String,
    reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    prefer: Prefer
  ): Any = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], prefer.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(text: String, reviver: Unit, prefer: Prefer): Any = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], prefer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("parse-conflict-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * returns true if the data looks like a conflicted diff file
    */
  inline def isDiff(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiff")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * If prefer is set to theirs, then the vaules of theirs and ours are switched in the resolver function.
    * (Ie, we'll apply their changes on top of our object, rather than the other way around.)
    * Parse the conflicted file into 3 pieces: ours, theirs, and parent
    * Get the diff from parent to ours.
    * Apply each change of that diff to theirs.
    * If any change in the diff set cannot be applied (ie, because they changed an object into a non-object and we changed a field on that object),
    * then replace the object at the specified path with the object at the path in ours.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.parseConflictJson.parseConflictJsonStrings.theirs
    - typingsJapgolly.parseConflictJson.parseConflictJsonStrings.ours
  */
  trait Prefer extends StObject
  object Prefer {
    
    inline def ours: typingsJapgolly.parseConflictJson.parseConflictJsonStrings.ours = "ours".asInstanceOf[typingsJapgolly.parseConflictJson.parseConflictJsonStrings.ours]
    
    inline def theirs: typingsJapgolly.parseConflictJson.parseConflictJsonStrings.theirs = "theirs".asInstanceOf[typingsJapgolly.parseConflictJson.parseConflictJsonStrings.theirs]
  }
}
