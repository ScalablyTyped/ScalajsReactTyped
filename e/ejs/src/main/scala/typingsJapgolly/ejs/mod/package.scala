package typingsJapgolly.ejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncClientFunction = js.Function4[
    /* locals */ js.UndefOr[typingsJapgolly.ejs.mod.Data], 
    /* escape */ js.UndefOr[typingsJapgolly.ejs.mod.EscapeCallback], 
    /* include */ js.UndefOr[typingsJapgolly.ejs.mod.IncludeCallback], 
    /* rethrow */ js.UndefOr[typingsJapgolly.ejs.mod.RethrowCallback], 
    js.Promise[java.lang.String]
  ]
  type AsyncTemplateFunction = js.Function1[/* data */ js.UndefOr[typingsJapgolly.ejs.mod.Data], js.Promise[java.lang.String]]
  type ClientFunction = js.Function4[
    /* locals */ js.UndefOr[typingsJapgolly.ejs.mod.Data], 
    /* escape */ js.UndefOr[typingsJapgolly.ejs.mod.EscapeCallback], 
    /* include */ js.UndefOr[typingsJapgolly.ejs.mod.IncludeCallback], 
    /* rethrow */ js.UndefOr[typingsJapgolly.ejs.mod.RethrowCallback], 
    java.lang.String
  ]
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EscapeCallback = js.Function1[/* markup */ js.UndefOr[js.Any], java.lang.String]
  type IncludeCallback = js.Function2[
    /* path */ java.lang.String, 
    /* data */ js.UndefOr[typingsJapgolly.ejs.mod.Data], 
    java.lang.String
  ]
  type RenderFileCallback[T] = js.Function2[/* err */ js.Error | scala.Null, /* str */ java.lang.String, T]
  type RethrowCallback = js.Function5[
    /* err */ js.Error, 
    /* str */ java.lang.String, 
    /* filename */ js.UndefOr[java.lang.String | scala.Null], 
    /* lineno */ scala.Double, 
    /* esc */ typingsJapgolly.ejs.mod.EscapeCallback, 
    scala.Nothing
  ]
  type TemplateFunction = js.Function1[/* data */ js.UndefOr[typingsJapgolly.ejs.mod.Data], java.lang.String]
  type fileLoader = js.Function1[/* path */ java.lang.String, java.lang.String | typingsJapgolly.ejs.AnonToString]
}
