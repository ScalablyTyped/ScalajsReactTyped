package typingsJapgolly.botvs.mod._Global_

import typingsJapgolly.botvs.botvsStrings.Close
import typingsJapgolly.botvs.botvsStrings.High
import typingsJapgolly.botvs.botvsStrings.Low
import typingsJapgolly.botvs.botvsStrings.Open
import typingsJapgolly.botvs.botvsStrings.Time
import typingsJapgolly.botvs.botvsStrings.Volume
import typingsJapgolly.botvs.mod._Global_.botvs.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TA")
@js.native
object TA extends js.Object {
  /**
    * 平均真实波幅
    *
    * ATR(数据, 周期), 默认参数为14, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def ATR(Records: js.Array[Record]): js.Array[Double] = js.native
  def ATR(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
  /**
    * Alligator Indicator
    *
    * Alligator(数据, 下颚周期,牙齿周期,上唇周期), 鳄鱼线指标, 默认参数为(13,8,5) 返回一个二维数组[下颚,牙齿,上唇]
    *
    * @param {botvs.Record[]} Records
    * @param {number} JawPeriod
    * @param {number} TeethPeriod
    * @param {number} LibsPeriod
    * @return {[number[] , number[] , number[]]}
    */
  def Alligator(Records: js.Array[Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def Alligator(Records: js.Array[Record], JawPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def Alligator(Records: js.Array[Record], JawPeriod: Double, TeethPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def Alligator(Records: js.Array[Record], JawPeriod: Double, TeethPeriod: Double, LibsPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  /**
    * Chaikin Money Flow
    *
    * CMF(数据, 周期), 默认周期参数为20, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def CMF(Records: js.Array[Record]): js.Array[Double] = js.native
  def CMF(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
  /**
    * 指数平均数指标
    * EMA(数据, 周期), 默认参数为9, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def EMA(Records: js.Array[Record]): js.Array[Double] = js.native
  def EMA(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
  /**
    * 周期最高价
    *
    * Highest(数据, 周期, 属性), 返回最近周期内的最大值(不包含当前Bar),
    * 如TA.Highest(records, 30, 'High'), 如果周期为0指所有, 如属性不指定则视数据为普通数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @param {keyof botvs.Record} Property
    * @return {number}
    * @constructor
    */
  def Highest(Records: js.Array[Record]): Double = js.native
  def Highest(Records: js.Array[Record], Period: Double): Double = js.native
  @JSName("Highest")
  def Highest_Close(Records: js.Array[Record], Period: Double, Property: Close): Double = js.native
  @JSName("Highest")
  def Highest_High(Records: js.Array[Record], Period: Double, Property: High): Double = js.native
  @JSName("Highest")
  def Highest_Low(Records: js.Array[Record], Period: Double, Property: Low): Double = js.native
  @JSName("Highest")
  def Highest_Open(Records: js.Array[Record], Period: Double, Property: Open): Double = js.native
  @JSName("Highest")
  def Highest_Time(Records: js.Array[Record], Period: Double, Property: Time): Double = js.native
  @JSName("Highest")
  def Highest_Volume(Records: js.Array[Record], Period: Double, Property: Volume): Double = js.native
  /**
    * 随机指标
    *
    * KDJ(数据, 周期1, 周期2, 周期3), 默认参数为(9, 3, 3), 返回二维数组, 分别是[K, D, J]
    *
    * @param {botvs.Record[]} Records
    * @param {number} FirstPeriod
    * @param {number} SecondPeriod
    * @param {number} ThirdPeriod
    * @return {[number[] , number[] , number[]]}
    */
  def KDJ(Records: js.Array[Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def KDJ(Records: js.Array[Record], FirstPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def KDJ(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def KDJ(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double, ThirdPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  /**
    * 周期最低价
    *
    * Lowest(数据, 周期, 属性), 同上, 求最小值
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @param {keyof botvs.Record} Property
    * @return {number}
    */
  def Lowest(Records: js.Array[Record]): Double = js.native
  def Lowest(Records: js.Array[Record], Period: Double): Double = js.native
  @JSName("Lowest")
  def Lowest_Close(Records: js.Array[Record], Period: Double, Property: Close): Double = js.native
  @JSName("Lowest")
  def Lowest_High(Records: js.Array[Record], Period: Double, Property: High): Double = js.native
  @JSName("Lowest")
  def Lowest_Low(Records: js.Array[Record], Period: Double, Property: Low): Double = js.native
  @JSName("Lowest")
  def Lowest_Open(Records: js.Array[Record], Period: Double, Property: Open): Double = js.native
  @JSName("Lowest")
  def Lowest_Time(Records: js.Array[Record], Period: Double, Property: Time): Double = js.native
  @JSName("Lowest")
  def Lowest_Volume(Records: js.Array[Record], Period: Double, Property: Volume): Double = js.native
  /**
    * 移动平均线
    *
    * MA(数据, 周期), 默认参数为9, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def MA(Records: js.Array[Record]): js.Array[Double] = js.native
  def MA(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
  /**
    * 指数平滑异同平均线
    *
    * MACD(数据, 快周期, 慢周期, 信号周期), 默认参数为(12, 26, 9), 返回二维数组, 分别是[DIF, DEA, MACD]
    *
    * @param {botvs.Record[]} Records
    * @param {number} LongPeriod
    * @param {number} ShortPeriod
    * @param {number} SignalPeriod
    * @return {[number[] , number[] , number[]]}
    */
  def MACD(Records: js.Array[Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def MACD(Records: js.Array[Record], LongPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def MACD(Records: js.Array[Record], LongPeriod: Double, ShortPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def MACD(Records: js.Array[Record], LongPeriod: Double, ShortPeriod: Double, SignalPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  /**
    * 能量潮
    *
    * OBV(数据), 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @return {[number[] , number[]]}
    */
  def OBV(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  /**
    * 强弱指标
    *
    * RSI(数据, 周期), 默认参数为14, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def RSI(Records: js.Array[Record]): js.Array[Double] = js.native
  def RSI(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
}

