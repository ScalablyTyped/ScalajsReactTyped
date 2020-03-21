package typingsJapgolly.wonderFrp.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "timeout")
@js.native
object timeout
  extends TopLevel[
      js.Function2[
        /* time */ js.Any, 
        /* scheduler */ js.UndefOr[typingsJapgolly.wonderFrp.schedulerMod.Scheduler], 
        typingsJapgolly.wonderFrp.timeoutStreamMod.TimeoutStream
      ]
    ]

