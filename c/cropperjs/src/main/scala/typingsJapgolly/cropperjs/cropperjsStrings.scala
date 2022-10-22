package typingsJapgolly.cropperjs

import typingsJapgolly.cropperjs.Cropper.Action
import typingsJapgolly.cropperjs.Cropper.DragMode
import typingsJapgolly.cropperjs.Cropper.ImageSmoothingQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropperjsStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with Action
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait crop
    extends StObject
       with Action
       with DragMode
  inline def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait e
    extends StObject
       with Action
  inline def e: e = "e".asInstanceOf[e]
  
  @js.native
  sealed trait high
    extends StObject
       with ImageSmoothingQuality
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait low
    extends StObject
       with ImageSmoothingQuality
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait medium
    extends StObject
       with ImageSmoothingQuality
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait move
    extends StObject
       with Action
       with DragMode
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait n
    extends StObject
       with Action
  inline def n: n = "n".asInstanceOf[n]
  
  @js.native
  sealed trait ne
    extends StObject
       with Action
  inline def ne: ne = "ne".asInstanceOf[ne]
  
  @js.native
  sealed trait none
    extends StObject
       with DragMode
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait nw
    extends StObject
       with Action
  inline def nw: nw = "nw".asInstanceOf[nw]
  
  @js.native
  sealed trait s
    extends StObject
       with Action
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait se
    extends StObject
       with Action
  inline def se: se = "se".asInstanceOf[se]
  
  @js.native
  sealed trait sw
    extends StObject
       with Action
  inline def sw: sw = "sw".asInstanceOf[sw]
  
  @js.native
  sealed trait w
    extends StObject
       with Action
  inline def w: w = "w".asInstanceOf[w]
  
  @js.native
  sealed trait zoom
    extends StObject
       with Action
  inline def zoom: zoom = "zoom".asInstanceOf[zoom]
}
