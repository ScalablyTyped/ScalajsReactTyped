package typingsJapgolly.std.global

import typingsJapgolly.std.StaticRangeInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StaticRange")
@js.native
open class StaticRange protected ()
  extends StObject
     with typingsJapgolly.std.AbstractRange {
  /* standard dom */
  def this(init: StaticRangeInit) = this()
  
  /** Returns true if range is collapsed, and false otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  
  /** Returns range's end node. */
  /* standard dom */
  /* CompleteClass */
  override val endContainer: org.scalajs.dom.Node = js.native
  
  /** Returns range's end offset. */
  /* standard dom */
  /* CompleteClass */
  override val endOffset: Double = js.native
  
  /** Returns range's start node. */
  /* standard dom */
  /* CompleteClass */
  override val startContainer: org.scalajs.dom.Node = js.native
  
  /** Returns range's start offset. */
  /* standard dom */
  /* CompleteClass */
  override val startOffset: Double = js.native
}
