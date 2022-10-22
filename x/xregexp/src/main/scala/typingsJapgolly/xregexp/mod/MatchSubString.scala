package typingsJapgolly.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A matched substring, including named capture groups as properties, or the `groups` property
  * if the `namespacing` feature is installed.
  */
@js.native
trait MatchSubString
  extends StObject
     with String
     with /**
  * Named capture groups are accessible as properties when the `namespacing`
  * feature is not installed.
  */
/* propName */ StringDictionary[Any] {
  
  /**
    * This is only present if the the `namespacing` feature is installed
    * using the `XRegExp.install` method.
    */
  var groups: js.UndefOr[NamedGroupsArray] = js.native
}
