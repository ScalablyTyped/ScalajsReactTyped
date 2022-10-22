package typingsJapgolly.glidejsGlide.mod

import typingsJapgolly.glidejsGlide.anon.Modify
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The component is a simple function that returns an object. Each component
  * has a single responsibility and communicates with other components using
  * events.
  */
type ComponentFunction[T /* <: Component */] = js.Function3[
/* glide */ Properties, 
/* components */ BuiltinComponentMap & (Record[String, js.UndefOr[Component]]), 
/* events */ EventsBus, 
T]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.glidejsGlide.glidejsGlideStrings.Greaterthansign
  - typingsJapgolly.glidejsGlide.glidejsGlideStrings.Lessthansign
  - typingsJapgolly.glidejsGlide.glidejsGlideStrings.GreaterthansignGreaterthansign
  - typingsJapgolly.glidejsGlide.glidejsGlideStrings.LessthansignLessthansign
  - java.lang.String
*/
type Pattern = _Pattern | String

type TransformerFunction = js.Function3[
/* glide */ Properties, 
/* components */ BuiltinComponentMap & (Record[String, js.UndefOr[Component]]), 
/* events */ EventsBus, 
Modify]
