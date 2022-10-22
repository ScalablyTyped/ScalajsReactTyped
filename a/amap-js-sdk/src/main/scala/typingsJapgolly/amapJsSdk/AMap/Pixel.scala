package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* --------------------------- 基础类 --------------------------- */
/* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
/**
  * 像素坐标，确定地图上的一个像素点。
  */
trait Pixel extends StObject {
  
  /**
    * 当前像素坐标与传入像素坐标是否相等
    */
  def equals(point: Pixel): Boolean
  
  /**
    * 获得X方向像素坐标
    */
  def getX(): Double
  
  /**
    * 获得Y方向像素坐标
    */
  def getY(): Double
}
object Pixel {
  
  inline def apply(equals_ : Pixel => Boolean, getX: CallbackTo[Double], getY: CallbackTo[Double]): Pixel = {
    val __obj = js.Dynamic.literal(getX = getX.toJsFn, getY = getY.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Pixel]
  }
  
  extension [Self <: Pixel](x: Self) {
    
    inline def setEquals_(value: Pixel => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
    
    inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
  }
}
