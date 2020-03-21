package typingsJapgolly.wonderJs

import typingsJapgolly.std.Float32Array
import typingsJapgolly.wonderJs.arrayBufferMod.ArrayBuffer
import typingsJapgolly.wonderJs.colorMod.Color
import typingsJapgolly.wonderJs.matrix3Mod.Matrix3
import typingsJapgolly.wonderJs.matrix4Mod.Matrix4
import typingsJapgolly.wonderJs.programMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/program/GLSLDataSender", JSImport.Namespace)
@js.native
object glsldatasenderMod extends js.Object {
  @js.native
  class GLSLDataSender protected () extends js.Object {
    def this(program: Program) = this()
    def addBufferToToSendList(pos: Double, buffer: ArrayBuffer): Unit = js.native
    def clearAllCache(): Unit = js.native
    def clearBufferList(): Unit = js.native
    def disableVertexAttribArray(): Unit = js.native
    def dispose(): Unit = js.native
    def getUniformLocation(name: String): js.Any = js.native
    def sendAllBufferData(): Unit = js.native
    def sendBuffer(pos: Double, buffer: ArrayBuffer): Unit = js.native
    def sendColor3(name: String, data: Color): Unit = js.native
    def sendFloat1(name: String, data: js.Any): Unit = js.native
    def sendFloat2(name: String, data: js.Any): Unit = js.native
    def sendFloat3(name: String, data: js.Any): Unit = js.native
    def sendFloat4(name: String, data: js.Any): Unit = js.native
    def sendMatrix3(name: String, data: Matrix3): Unit = js.native
    def sendMatrix4(name: String, data: Matrix4): Unit = js.native
    def sendMatrix4Array(name: String, data: js.Array[Double]): Unit = js.native
    def sendMatrix4Array(name: String, data: Float32Array): Unit = js.native
    def sendNum1(name: String, data: Double): Unit = js.native
    def sendSampleArray(name: String, data: js.Array[Double]): Unit = js.native
    def sendVector2(name: String, data: js.Any): Unit = js.native
    def sendVector3(name: String, data: js.Any): Unit = js.native
    def sendVector4(name: String, data: js.Any): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GLSLDataSender extends js.Object {
    def create(program: Program): GLSLDataSender = js.native
  }
  
}

