package typingsJapgolly.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frontendMod {
  type JupyterFrontEnd[T /* <: typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell */] = typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd_[T]
  type JupyterFrontEndPlugin[T] = typingsJapgolly.phosphorApplication.mod.IPlugin[
    typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd[typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell], 
    T
  ]
}
