package typingsJapgolly.walk

import typingsJapgolly.walk.mod.WalkStatArrayEvent
import typingsJapgolly.walk.mod.WalkStatEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object walkStrings {
  @js.native
  sealed trait FIFO extends js.Object
  
  @js.native
  sealed trait blockDevice extends js.Object
  
  @js.native
  sealed trait characterDevice extends js.Object
  
  @js.native
  sealed trait directories extends WalkStatArrayEvent
  
  @js.native
  sealed trait directory extends WalkStatEvent
  
  @js.native
  sealed trait directoryError extends WalkStatArrayEvent
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait errors extends WalkStatArrayEvent
  
  @js.native
  sealed trait file extends WalkStatEvent
  
  @js.native
  sealed trait files extends WalkStatArrayEvent
  
  @js.native
  sealed trait names extends js.Object
  
  @js.native
  sealed trait nodeError extends WalkStatArrayEvent
  
  @js.native
  sealed trait socket extends js.Object
  
  @js.native
  sealed trait symbolicLink extends js.Object
  
  @scala.inline
  def FIFO: FIFO = "FIFO".asInstanceOf[FIFO]
  @scala.inline
  def blockDevice: blockDevice = "blockDevice".asInstanceOf[blockDevice]
  @scala.inline
  def characterDevice: characterDevice = "characterDevice".asInstanceOf[characterDevice]
  @scala.inline
  def directories: directories = "directories".asInstanceOf[directories]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def directoryError: directoryError = "directoryError".asInstanceOf[directoryError]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def errors: errors = "errors".asInstanceOf[errors]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def files: files = "files".asInstanceOf[files]
  @scala.inline
  def names: names = "names".asInstanceOf[names]
  @scala.inline
  def nodeError: nodeError = "nodeError".asInstanceOf[nodeError]
  @scala.inline
  def socket: socket = "socket".asInstanceOf[socket]
  @scala.inline
  def symbolicLink: symbolicLink = "symbolicLink".asInstanceOf[symbolicLink]
}

