package typingsJapgolly.grpc.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrpcObject
  extends /* name */ StringDictionary[
      GrpcObject | (Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        js.UndefOr[/* options */ js.Object], 
        Client
      ]) | Message[js.Object]
    ]

object GrpcObject {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      GrpcObject | (Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        js.UndefOr[/* options */ js.Object], 
        Client
      ]) | Message[js.Object]
    ] = null
  ): GrpcObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GrpcObject]
  }
}

