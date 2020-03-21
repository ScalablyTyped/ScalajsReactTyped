package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.esri.RequestOptions
import typingsJapgolly.arcgisJsApi.esri.RequestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/request", JSImport.Namespace)
@js.native
object requestMod
  extends TopLevel[
      js.Function2[
        /* url */ String, 
        /* options */ js.UndefOr[RequestOptions], 
        js.Promise[RequestResponse]
      ]
    ]

