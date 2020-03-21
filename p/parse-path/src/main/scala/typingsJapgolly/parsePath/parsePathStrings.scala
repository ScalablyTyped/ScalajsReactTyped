package typingsJapgolly.parsePath

import typingsJapgolly.parsePath.mod.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object parsePathStrings {
  @js.native
  sealed trait file extends Protocol
  
  @js.native
  sealed trait git extends Protocol
  
  @js.native
  sealed trait http extends Protocol
  
  @js.native
  sealed trait https extends Protocol
  
  @js.native
  sealed trait ssh extends Protocol
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
}

