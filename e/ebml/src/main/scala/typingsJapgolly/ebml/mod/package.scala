package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.end
import typingsJapgolly.ebml.ebmlStrings.start
import typingsJapgolly.ebml.ebmlStrings.tag
import typingsJapgolly.ebml.mod.^
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def schema: Map[Double, EBMLTagSchema] = ^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[Map[Double, EBMLTagSchema]]

type StateAndTagData = js.Tuple2[tag | start | end, Tag[Any] | TagMetadata]
