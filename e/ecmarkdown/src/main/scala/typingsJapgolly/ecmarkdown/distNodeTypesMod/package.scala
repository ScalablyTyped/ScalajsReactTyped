package typingsJapgolly.ecmarkdown.distNodeTypesMod

import typingsJapgolly.ecmarkdown.anon.Location
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.contents
import typingsJapgolly.ecmarkdown.ecmarkdownStrings.location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Inlined std.Exclude<ecmarkdown.ecmarkdown/dist/node-types.Token, ecmarkdown.ecmarkdown/dist/node-types.EOFToken> */
type NotEOFToken = contents

type Unlocated[T /* <: Location */] = ActualOmit[T, location]
