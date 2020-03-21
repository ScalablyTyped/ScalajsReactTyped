package typingsJapgolly.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapkit {
  type AutocompleteSearchCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsJapgolly.appleMapkitJs.mapkit.SearchAutocompleteResponse, 
    scala.Unit
  ]
  type ImportGeoJSONCallback = js.Function2[
    /* error */ js.Error, 
    /* result */ typingsJapgolly.appleMapkitJs.mapkit.ItemCollection, 
    scala.Unit
  ]
  type SearchCallback[Q] = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsJapgolly.appleMapkitJs.AnonDisplayRegion[Q], 
    scala.Unit
  ]
  type URLTemplateCallback = js.Function5[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* z */ scala.Double, 
    /* scale */ scala.Double, 
    /* data */ js.Object, 
    java.lang.String
  ]
}
