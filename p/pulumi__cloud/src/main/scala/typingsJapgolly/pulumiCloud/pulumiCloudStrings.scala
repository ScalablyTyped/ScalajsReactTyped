package typingsJapgolly.pulumiCloud

import typingsJapgolly.pulumiCloud.serviceMod.ContainerProtocol
import typingsJapgolly.pulumiCloud.serviceMod.HostOperatingSystem
import typingsJapgolly.pulumiCloud.serviceMod.VolumeKind
import typingsJapgolly.pulumiCloud.tableMod.PrimaryKeyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pulumiCloudStrings {
  @js.native
  sealed trait HostPathVolume extends VolumeKind
  
  @js.native
  sealed trait SharedVolume extends VolumeKind
  
  @js.native
  sealed trait boolean extends PrimaryKeyType
  
  @js.native
  sealed trait http extends ContainerProtocol
  
  @js.native
  sealed trait https extends ContainerProtocol
  
  @js.native
  sealed trait linux extends HostOperatingSystem
  
  @js.native
  sealed trait number extends PrimaryKeyType
  
  @js.native
  sealed trait string extends PrimaryKeyType
  
  @js.native
  sealed trait tcp extends ContainerProtocol
  
  @js.native
  sealed trait udp extends ContainerProtocol
  
  @js.native
  sealed trait windows extends HostOperatingSystem
  
  @scala.inline
  def HostPathVolume: HostPathVolume = "HostPathVolume".asInstanceOf[HostPathVolume]
  @scala.inline
  def SharedVolume: SharedVolume = "SharedVolume".asInstanceOf[SharedVolume]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

