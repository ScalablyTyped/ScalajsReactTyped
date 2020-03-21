package typingsJapgolly.framesync

import typingsJapgolly.framesync.typesMod.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framesync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getFrameData(): AnonDelta = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(cancelSync) */ @js.native
  object default extends js.Object {
    def fixedUpdate(process: Process): Process = js.native
    def fixedUpdate(process: Process, keepAlive: Boolean): Process = js.native
    def fixedUpdate(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def postRender(process: Process): Process = js.native
    def postRender(process: Process, keepAlive: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def read(process: Process): Process = js.native
    def read(process: Process, keepAlive: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def render(process: Process): Process = js.native
    def render(process: Process, keepAlive: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def update(process: Process): Process = js.native
    def update(process: Process, keepAlive: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
  }
  
}

