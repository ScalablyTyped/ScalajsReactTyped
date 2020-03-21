package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.controls
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.grommet.videoMod.VideoProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.VideoHTMLAttributes
import typingsJapgolly.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Video")
@js.native
class Video protected ()
  extends Component[
      VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        controls
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: VideoProps with (DetailedHTMLProps[
        VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
        org.scalajs.dom.raw.HTMLVideoElement
      ]) with (Omit[
        DetailedHTMLProps[
          VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
          org.scalajs.dom.raw.HTMLVideoElement
        ], 
        controls
      ])) = this()
  def this(
    props: VideoProps with (DetailedHTMLProps[
        VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
        org.scalajs.dom.raw.HTMLVideoElement
      ]) with (Omit[
        DetailedHTMLProps[
          VideoHTMLAttributes[org.scalajs.dom.raw.HTMLVideoElement], 
          org.scalajs.dom.raw.HTMLVideoElement
        ], 
        controls
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Video")
@js.native
object Video extends TopLevel[
      ComponentClass[
        VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
          DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
          controls
        ]), 
        ComponentState
      ]
    ]

