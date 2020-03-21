package typingsJapgolly.svgIntersections

import typingsJapgolly.svgIntersections.mod.SvgElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object svgIntersectionsStrings {
  @js.native
  sealed trait circle extends SvgElements
  
  @js.native
  sealed trait ellipse extends SvgElements
  
  @js.native
  sealed trait line extends SvgElements
  
  @js.native
  sealed trait path extends SvgElements
  
  @js.native
  sealed trait polygon extends SvgElements
  
  @js.native
  sealed trait polyline extends SvgElements
  
  @js.native
  sealed trait rect extends SvgElements
  
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def ellipse: ellipse = "ellipse".asInstanceOf[ellipse]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  @scala.inline
  def polygon: polygon = "polygon".asInstanceOf[polygon]
  @scala.inline
  def polyline: polyline = "polyline".asInstanceOf[polyline]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
}

